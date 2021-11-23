Primary
    @Bean(name = "propertyDatasource")
    @ConfigurationProperties(prefix = "spring.property.datasource")
    public DataSource dataSource(){
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "propertyEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean
            (EntityManagerFactoryBuilder builder, @Qualifier("propertyDatasource") DataSource dataSource){
        Map<String, Object> props = new HashMap<>();
        props.put("hibernate.hbm2ddl.auto", "update");
        props.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
        return builder.dataSource(dataSource).properties(props).
                packages("com.example.policycreation.property")
                .persistenceUnit("Property").build();
    }

    @Primary
    @Bean(name = "propertyTransactionManager")
    public PlatformTransactionManager transactionManager(@Qualifier("propertyEntityManagerFactory")
                                                                 EntityManagerFactory entityManagerFactory){
        return new JpaTransactionManager(entityManagerFactory);
    }
