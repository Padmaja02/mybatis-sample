package com.generated.mybatis.client;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.generated.mybatis.model.Product;
import com.generated.mybatis.model.ProductExample.Criteria;
import com.generated.mybatis.model.ProductExample.Criterion;
import com.generated.mybatis.model.ProductExample;
import java.util.List;
import java.util.Map;

public class ProductSqlProvider {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT
	 * @mbggenerated  Tue May 15 14:05:00 PDT 2012
	 */
	public String countByExample(ProductExample example) {
		BEGIN();
		SELECT("count (*)");
		FROM("PRODUCT");
		applyWhere(example, false);
		return SQL();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT
	 * @mbggenerated  Tue May 15 14:05:00 PDT 2012
	 */
	public String deleteByExample(ProductExample example) {
		BEGIN();
		DELETE_FROM("PRODUCT");
		applyWhere(example, false);
		return SQL();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT
	 * @mbggenerated  Tue May 15 14:05:00 PDT 2012
	 */
	public String insertSelective(Product record) {
		BEGIN();
		INSERT_INTO("PRODUCT");
		if (record.getId() != null) {
			VALUES("id", "#{id,jdbcType=BIGINT}");
		}
		if (record.getTitle() != null) {
			VALUES("title", "#{title,jdbcType=VARCHAR}");
		}
		if (record.getDescription() != null) {
			VALUES("description", "#{description,jdbcType=LONGVARCHAR}");
		}
		return SQL();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT
	 * @mbggenerated  Tue May 15 14:05:00 PDT 2012
	 */
	public String selectByExampleWithBLOBs(ProductExample example) {
		BEGIN();
		if (example != null && example.isDistinct()) {
			SELECT_DISTINCT("id");
		} else {
			SELECT("id");
		}
		SELECT("title");
		SELECT("description");
		FROM("PRODUCT");
		applyWhere(example, false);
		if (example != null && example.getOrderByClause() != null) {
			ORDER_BY(example.getOrderByClause());
		}
		return SQL();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT
	 * @mbggenerated  Tue May 15 14:05:00 PDT 2012
	 */
	public String selectByExample(ProductExample example) {
		BEGIN();
		if (example != null && example.isDistinct()) {
			SELECT_DISTINCT("id");
		} else {
			SELECT("id");
		}
		SELECT("title");
		FROM("PRODUCT");
		applyWhere(example, false);
		if (example != null && example.getOrderByClause() != null) {
			ORDER_BY(example.getOrderByClause());
		}
		return SQL();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT
	 * @mbggenerated  Tue May 15 14:05:00 PDT 2012
	 */
	public String updateByExampleSelective(Map<String, Object> parameter) {
		Product record = (Product) parameter.get("record");
		ProductExample example = (ProductExample) parameter.get("example");
		BEGIN();
		UPDATE("PRODUCT");
		if (record.getId() != null) {
			SET("id = #{record.id,jdbcType=BIGINT}");
		}
		if (record.getTitle() != null) {
			SET("title = #{record.title,jdbcType=VARCHAR}");
		}
		if (record.getDescription() != null) {
			SET("description = #{record.description,jdbcType=LONGVARCHAR}");
		}
		applyWhere(example, true);
		return SQL();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT
	 * @mbggenerated  Tue May 15 14:05:00 PDT 2012
	 */
	public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
		BEGIN();
		UPDATE("PRODUCT");
		SET("id = #{record.id,jdbcType=BIGINT}");
		SET("title = #{record.title,jdbcType=VARCHAR}");
		SET("description = #{record.description,jdbcType=LONGVARCHAR}");
		ProductExample example = (ProductExample) parameter.get("example");
		applyWhere(example, true);
		return SQL();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT
	 * @mbggenerated  Tue May 15 14:05:00 PDT 2012
	 */
	public String updateByExample(Map<String, Object> parameter) {
		BEGIN();
		UPDATE("PRODUCT");
		SET("id = #{record.id,jdbcType=BIGINT}");
		SET("title = #{record.title,jdbcType=VARCHAR}");
		ProductExample example = (ProductExample) parameter.get("example");
		applyWhere(example, true);
		return SQL();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT
	 * @mbggenerated  Tue May 15 14:05:00 PDT 2012
	 */
	public String updateByPrimaryKeySelective(Product record) {
		BEGIN();
		UPDATE("PRODUCT");
		if (record.getTitle() != null) {
			SET("title = #{title,jdbcType=VARCHAR}");
		}
		if (record.getDescription() != null) {
			SET("description = #{description,jdbcType=LONGVARCHAR}");
		}
		WHERE("id = #{id,jdbcType=BIGINT}");
		return SQL();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PRODUCT
	 * @mbggenerated  Tue May 15 14:05:00 PDT 2012
	 */
	protected void applyWhere(ProductExample example,
			boolean includeExamplePhrase) {
		if (example == null) {
			return;
		}
		String parmPhrase1;
		String parmPhrase1_th;
		String parmPhrase2;
		String parmPhrase2_th;
		String parmPhrase3;
		String parmPhrase3_th;
		if (includeExamplePhrase) {
			parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
			parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
			parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
			parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
			parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
			parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
		} else {
			parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
			parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
			parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
			parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
			parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
			parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
		}
		StringBuilder sb = new StringBuilder();
		List<Criteria> oredCriteria = example.getOredCriteria();
		boolean firstCriteria = true;
		for (int i = 0; i < oredCriteria.size(); i++) {
			Criteria criteria = oredCriteria.get(i);
			if (criteria.isValid()) {
				if (firstCriteria) {
					firstCriteria = false;
				} else {
					sb.append(" or ");
				}
				sb.append('(');
				List<Criterion> criterions = criteria.getAllCriteria();
				boolean firstCriterion = true;
				for (int j = 0; j < criterions.size(); j++) {
					Criterion criterion = criterions.get(j);
					if (firstCriterion) {
						firstCriterion = false;
					} else {
						sb.append(" and ");
					}
					if (criterion.isNoValue()) {
						sb.append(criterion.getCondition());
					} else if (criterion.isSingleValue()) {
						if (criterion.getTypeHandler() == null) {
							sb.append(String.format(parmPhrase1,
									criterion.getCondition(), i, j));
						} else {
							sb.append(String.format(parmPhrase1_th,
									criterion.getCondition(), i, j,
									criterion.getTypeHandler()));
						}
					} else if (criterion.isBetweenValue()) {
						if (criterion.getTypeHandler() == null) {
							sb.append(String.format(parmPhrase2,
									criterion.getCondition(), i, j, i, j));
						} else {
							sb.append(String.format(parmPhrase2_th,
									criterion.getCondition(), i, j,
									criterion.getTypeHandler(), i, j,
									criterion.getTypeHandler()));
						}
					} else if (criterion.isListValue()) {
						sb.append(criterion.getCondition());
						sb.append(" (");
						List<?> listItems = (List<?>) criterion.getValue();
						boolean comma = false;
						for (int k = 0; k < listItems.size(); k++) {
							if (comma) {
								sb.append(", ");
							} else {
								comma = true;
							}
							if (criterion.getTypeHandler() == null) {
								sb.append(String.format(parmPhrase3, i, j, k));
							} else {
								sb.append(String.format(parmPhrase3_th, i, j,
										k, criterion.getTypeHandler()));
							}
						}
						sb.append(')');
					}
				}
				sb.append(')');
			}
		}
		if (sb.length() > 0) {
			WHERE(sb.toString());
		}
	}
}