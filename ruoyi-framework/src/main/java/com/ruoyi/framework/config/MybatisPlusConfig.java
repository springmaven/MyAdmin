package com.ruoyi.framework.config;

//import com.baomidou.mybatisplus.autoconfigure.ConfigurationCustomizer;
//import com.google.common.collect.Sets;
//import com.ruoyi.framework.util.ShiroUtils;
//import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
//import org.springframework.boot.autoconfigure.AutoConfigureAfter;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
//import com.baomidou.mybatisplus.extension.plugins.handler.TenantLineHandler;
//import com.baomidou.mybatisplus.extension.plugins.inner.TenantLineInnerInterceptor;
//import net.sf.jsqlparser.expression.Expression;
//import net.sf.jsqlparser.expression.LongValue;
//import java.util.HashSet;

/**
 * 多租户配置
 * zzw
 */
//@Configuration
//@AutoConfigureAfter({MybatisAutoConfiguration.class})
public class MybatisPlusConfig {
//    //租戶列
//    private static final String TENANT_ID_COLUMN="tenant_code";
//    //忽略表名
//    private static final HashSet<String> IGNORE_TABLE_NAMES= Sets.newHashSet("sys","qrtz");
//    /**
//     * 新多租户插件配置,一缓和二缓遵循mybatis的规则,需要设置 MybatisConfiguration#useDeprecatedExecutor = false 避免缓存万一出现问题
//     */
//    @Bean
//    public MybatisPlusInterceptor mybatisPlusInterceptor() {
//        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
//        interceptor.addInnerInterceptor(new TenantLineInnerInterceptor(new TenantLineHandler() {
//            @Override
//            public Expression getTenantId() {
//                return new LongValue(ShiroUtils.getSysUser().getDept().getDeptId());
//            }
//
//            @Override
//            public boolean ignoreTable(String tableName) {
//                for (String ignoreTableName : IGNORE_TABLE_NAMES) {
//                    if(tableName.startsWith(ignoreTableName)){
//                        return Boolean.TRUE;
//                    }
//                }
//                return Boolean.FALSE;
//            }
//
//            @Override
//            public String getTenantIdColumn() {
//                return TENANT_ID_COLUMN;
//            }
//
//
//
//        }));
//        // 如果用了分页插件注意先 add TenantLineInnerInterceptor 再 add PaginationInnerInterceptor
//        // 用了分页插件必须设置 MybatisConfiguration#useDeprecatedExecutor = false
//        //interceptor.addInnerInterceptor(new PaginationInnerInterceptor());
//        return interceptor;
//    }
//
//    @Bean
//    public ConfigurationCustomizer configurationCustomizer() {
//        return configuration -> configuration.setMapUnderscoreToCamelCase(true);//设置驼峰命名规则
//       // return configuration -> configuration.setUseDeprecatedExecutor(false);
//    }
}
