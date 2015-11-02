/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * JobResourcesFindBulkUdtTemplateItem.java
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
import com.csgsystems.we.data.*;

/**
 *
 * Class used to create a JobResourcesFindBulkUdtTemplateItem Bulk Template
 *
 */

public class JobResourcesFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected JobResourcesObjectFilter JobResourcesFindIn;
/**
 *
 * Constructor to create a  JobResourcesFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public JobResourcesFindBulkUdtTemplateItem(String id, BSDMSessionContext context, JobResourcesObjectFilter JobResourcesFindInIn) {
    super(id, context, "JobResourcesFind");
    JobResourcesFindIn = JobResourcesFindInIn;
  }

  public void translateToMap() {
    if (JobResourcesFindIn != null) {
      Integer index =  JobResourcesFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("JobResources", JobResourcesObjectHelper.toMap(JobResourcesFindIn, new HashMap(), "JobResources").get("JobResources"));
    }
  }


/**
 *
 * Sets the JobResources
 * @param JobResourcesFindInIn Value of the JobResourcesFindIn
 *
 */

  public void setJobResources(JobResourcesObjectFilter JobResourcesFindInIn) {
    JobResourcesFindIn = JobResourcesFindInIn;
  }

  public void translateFromMap() {
    JobResourcesFindIn = JobResourcesObjectHelper.fromMapFilter(inputMap, "JobResources");
  }

/**
 *
 * Gets the JobResources
 * @return Value of the JobResources
 *
 */

  public JobResourcesObjectFilter getJobResources( ) {
    return JobResourcesFindIn;
  }

}
