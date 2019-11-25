package mybatis;

import enums.GenderEnum;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GenderEnumHandler implements TypeHandler<GenderEnum> {

    public void setParameter(PreparedStatement preparedStatement, int i, GenderEnum genderEnum, JdbcType jdbcType) throws SQLException {
        preparedStatement.setString(i, genderEnum.getSex());
    }

    public GenderEnum getResult(ResultSet resultSet, String s) throws SQLException {
        String index = resultSet.getString(s);
        return GenderEnum.getGenderEnum(index);
    }

    public GenderEnum getResult(ResultSet resultSet, int i) throws SQLException {
        String index = resultSet.getString(i);
        return GenderEnum.getGenderEnum(index);
    }

    public GenderEnum getResult(CallableStatement callableStatement, int i) throws SQLException {
       String index = callableStatement.getString(i);
        return GenderEnum.getGenderEnum(index);
    }
}
