/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * JobResourcesCreateBulkUdtTemplateItem.java
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
 * Class used to create a JobResourcesCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class JobResourcesCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected JobResourcesObjectData JobResourcesCreateIn;
/**
 *
 * Constructor to create a  JobResourcesCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public JobResourcesCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, JobResourcesObjectData JobResourcesCreateInIn) {
    super(id, context, "JobResourcesCreate");
    JobResourcesCreateIn = JobResourcesCreateInIn;
  }

  public void translateToMap() {
    if (JobResourcesCreateIn != null) {
      JobResourcesCreateIn.resetFlags(true, true);
      addInput("JobResources", JobResourcesObjectHelper.toMap(JobResourcesCreateIn, new HashMap(), "JobResources").get("JobResources"));
    }
  }


/**
 *
 * Sets the JobResources
 * @param JobResourcesCreateInIn Value of the JobResourcesCreateIn
 *
 */

  public void setJobResources(JobResourcesObjectData JobResourcesCreateInIn) {
    JobResourcesCreateIn = JobResourcesCreateInIn;
  }

  public void translateFromMap() {
    JobResourcesCreateIn = JobResourcesObjectHelper.fromMap(inputMap, "JobResources");
  }

/**
 *
 * Gets the JobResources
 * @return Value of the JobResources
 *
 */

  public JobResourcesObjectData getJobResources( ) {
    return JobResourcesCreateIn;
  }

}
