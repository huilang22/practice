/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LogGenerateBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.utl.data.*;

/**
 *
 * Class used to create a LogGenerateBulkUdtTemplateItem Bulk Template
 *
 */

public class LogGenerateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected LogCriteriaObjectData log_criteria;
/**
 *
 * Constructor to create a  LogGenerateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public LogGenerateBulkUdtTemplateItem(String id, BSDMSessionContext context, LogCriteriaObjectData log_criteriaIn) {
    super(id, context, "LogGenerate");
    log_criteria = log_criteriaIn;
  }

  public void translateToMap() {
    if (log_criteria != null) {
      log_criteria.resetFlags(true, true);
      addInput("LogCriteria", LogCriteriaObjectHelper.toMap(log_criteria, new HashMap(), "LogGenerateOutputData").get("LogGenerateOutputData"));
    }
  }


/**
 *
 * Sets the LogCriteria
 * @param log_criteriaIn Value of the log_criteria
 *
 */

  public void setLogCriteria(LogCriteriaObjectData log_criteriaIn) {
    log_criteria = log_criteriaIn;
  }

  public void translateFromMap() {
    log_criteria = LogCriteriaObjectHelper.fromMap(inputMap, "LogCriteria");
  }

/**
 *
 * Gets the LogCriteria
 * @return Value of the LogCriteria
 *
 */

  public LogCriteriaObjectData getLogCriteria( ) {
    return log_criteria;
  }

}
