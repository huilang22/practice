/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * JobResourcesUpdateBulkUdtTemplateItem.java
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
 * Class used to create a JobResourcesUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class JobResourcesUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected JobResourcesObjectData JobResourcesUpdateIn;
/**
 *
 * Constructor to create a  JobResourcesUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public JobResourcesUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, JobResourcesObjectData JobResourcesUpdateInIn) {
    super(id, context, "JobResourcesUpdate");
    JobResourcesUpdateIn = JobResourcesUpdateInIn;
  }

  public void translateToMap() {
    if (JobResourcesUpdateIn != null) {
      JobResourcesUpdateIn.resetFlags(true, true);
      addInput("JobResources", JobResourcesObjectHelper.toMap(JobResourcesUpdateIn, new HashMap(), "JobResources").get("JobResources"));
    }
  }


/**
 *
 * Sets the JobResources
 * @param JobResourcesUpdateInIn Value of the JobResourcesUpdateIn
 *
 */

  public void setJobResources(JobResourcesObjectData JobResourcesUpdateInIn) {
    JobResourcesUpdateIn = JobResourcesUpdateInIn;
  }

  public void translateFromMap() {
    JobResourcesUpdateIn = JobResourcesObjectHelper.fromMap(inputMap, "JobResources");
  }

/**
 *
 * Gets the JobResources
 * @return Value of the JobResources
 *
 */

  public JobResourcesObjectData getJobResources( ) {
    return JobResourcesUpdateIn;
  }

}
