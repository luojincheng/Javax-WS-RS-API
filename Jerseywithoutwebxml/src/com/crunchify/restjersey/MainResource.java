/**
 * 
 */
package com.crunchify.restjersey;

/**
 * @author siddgarg
 *
 */

import com.crunchify.restjersey.FtoCService;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/MerlinManagement1")
public class MainResource extends Application{
	
	public MainResource() {
	}
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new HashSet<Class<?>>(120);
		//add actual rest resources here
		resources.add(FtoCService.class);
		resources.add(CtoFService.class);
		return resources;
}
}
