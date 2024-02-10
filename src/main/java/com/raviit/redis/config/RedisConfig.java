package com.raviit.redis.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

@Configuration
public class RedisConfig {

	
	@Bean
	public JedisConnectionFactory jedisConnectionFactory() {

		RedisStandaloneConfiguration serverConfig = 
				new RedisStandaloneConfiguration("redis-18982.c322.us-east-1-2.ec2.cloud.redislabs.com", 18982);

		serverConfig.setUsername("default");
		serverConfig.setPassword("1qtHhP9IODYMiL66EVhyIZsrsdkrYFIe");

		JedisClientConfiguration clientConfig = JedisClientConfiguration.builder().build();

		return new JedisConnectionFactory(serverConfig, clientConfig);
	}
}
