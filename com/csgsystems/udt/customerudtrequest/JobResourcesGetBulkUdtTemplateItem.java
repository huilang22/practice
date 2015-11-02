/*
 * Generated code DO NOT EDIT
 * Generated file: JobResourcesGetBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a JobResourcesGetBulkUdtTemplateItem Bulk Template
 *
 */

public class JobResourcesGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected JobResourcesObjectKeyData JobResourcesGetIn;
/**
 *
 * Constructor to create a  JobResourcesGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public JobResourcesGetBulkUdtTemplateItem(String id, BSDMSessionContext context, JobResourcesObjectKeyData JobResourcesGetInIn) {
    super(id, context, "JobResourcesGet");
    JobResourcesGetIn = JobResourcesGetInIn;
  }

  public void translateToMap() {
    if (JobResourcesGetIn != null) {
      JobResourcesGetIn.resetFlags(true, true);
      addInput("JobResources", JobResourcesObjectKeyHelper.toMap(JobResourcesGetIn, new HashMap(), "JobResourcesObjectKeyData").get("JobResourcesObjectKeyData"));
    }
  }


/**
 *
 * Sets the JobResources
 * @param JobResourcesGetInIn Value of the JobResourcesGetIn
 *
 */

  public void setJobResources(JobResourcesObjectKeyData JobResourcesGetInIn) {
    JobResourcesGetIn = JobResourcesGetInIn;
  }

  public void translateFromMap() {
    JobResourcesGetIn = JobResourcesObjectKeyHelper.fromMap(inputMap, "JobResources");
  }

/**
 *
 * Gets the JobResources
 * @return Value of the JobResources
 *
 */

  public JobResourcesObjectKeyData getJobResources( ) {
    return JobResourcesGetIn;
  }

}
