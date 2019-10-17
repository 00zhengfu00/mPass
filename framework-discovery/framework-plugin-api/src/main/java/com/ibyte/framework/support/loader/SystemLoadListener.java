package com.ibyte.framework.support.loader;

import com.ibyte.component.spring.listener.AbstractApplicationRunListener;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * 监听系统加载事件
 * // TODO
 *
 * @author li.Shangzhi
 * @Date: 2019-10-15 00:51
 */
public class SystemLoadListener extends AbstractApplicationRunListener {
	public SystemLoadListener(SpringApplication app, String[] args) {
		super(app, args);
	}


	protected static volatile SystemLoadListener LOADER;

	@Override
	public void starting() {

	}

	@Override
	public void environmentPrepared(ConfigurableEnvironment environment) {
		// 不在这里触发，是避免跟优先于日志的调整

	}

	@Override
	public void contextPrepared(ConfigurableApplicationContext context) {

	}

	@Override
	public void contextLoaded(ConfigurableApplicationContext context) {

	}

	@Override
	public void started(ConfigurableApplicationContext context) {

	}

	@Override
	public void running(ConfigurableApplicationContext context) {

	}

	@Override
	public void failed(ConfigurableApplicationContext context, Throwable exception) {

	}
}
