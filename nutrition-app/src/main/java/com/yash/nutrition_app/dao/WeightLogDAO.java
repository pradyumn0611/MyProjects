package com.yash.nutrition_app.dao;

import java.util.List;

/**
 *     All  WeightLog  Operations are declared in this interface.
 *     These 4 functionalies are provided for Weightlog module.
 *     @author pradyumn
 *     
 */

import com.yash.nutrition_app.model.WeightLog;

public interface WeightLogDAO {

/**
 *  To save all the value to weightlog.
 */
	WeightLog save(WeightLog weightLog);
/**
*   To display the values in weightlog.
*/
	List<WeightLog> findAll()  ;
/**
 * 	To update values for weightLog.
 */ 
  WeightLog update(WeightLog weightLog) ;
  /**
   * 
   * To delete your weight log.
   */
 
	WeightLog delete(WeightLog weightLog);

}
