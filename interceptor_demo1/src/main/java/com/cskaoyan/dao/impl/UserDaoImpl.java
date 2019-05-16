package com.cskaoyan.dao.impl;

import com.cskaoyan.bean.Help;
import com.cskaoyan.bean.Result;
import com.cskaoyan.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.io.*;

@Repository
public class UserDaoImpl extends JdbcDaoSupport implements UserDao {

    @Autowired
    public void mySetDataSource(DataSource dataSource) {
        this.setDataSource(dataSource);
    }

    @Override
    public int queryUserByUsername(String username) {
        return 0;
    }

    @Override
    public void importData(File file) throws IOException {
        //id prefix前缀 province省 city市 operator运营商 areacode区号 postcode邮编
        String sql = "insert into j13_data_t values (?,?,?,?,?,?,?)";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String s = null;
        while ((s = bufferedReader.readLine()) != null) {
            String[] split = s.split(",");
            int id = Integer.parseInt(split[0]);
            String prefix = split[1].substring(1,split[1].length()-1);
            String province = split[2].substring(1,split[2].length()-1);
            String city = split[3].substring(1,split[3].length()-1);
            String operator = split[4].substring(1,split[4].length()-1);
            String areacode = split[5].substring(1,split[5].length()-1);
            String postcode = split[6].substring(1,split[6].length()-1);
            getJdbcTemplate().update(sql, id,prefix,province,city,operator,areacode,postcode);
            System.out.println(id);
        }
    }

    @Override
    public Result queryPhone(String phone) {
        //    area		string	手机号码所在地区区号
//    postno		string	所在地区邮编
//    prefix		string	运营商号段
//    operators	string	所属运营商
//    city		string	归属地(城市)
//    province	string	归属地（省）
        String prefix = phone.substring(0, 7);
//        String sql = "select areacode,postcode,operator,city,province from j13_data_t where prefix = ?";
        String sql = "select * from j13_data_t where prefix = ?";
        Help help = (Help) getJdbcTemplate().queryForObject(sql, new BeanPropertyRowMapper<Help>(Help.class), prefix);

//        String province;
//        String city;
//        String operator;
//        String areacode;
//        String postcode;
        Result result = new Result();
        if (help != null) {
            result.setPhone(phone);
            result.setSuccess(1);
            result.setArea(help.getAreacode());
            result.setPostno(help.getPostcode());
            result.setOperators(help.getOperator());
            result.setCity(help.getCity());
            result.setProvince(help.getProvince());
            result.setPrefix(prefix);
        } else {
            result.setSuccess(0);
            result.setMsg("该号段为非法号段");
        }
        return result;
    }
}
