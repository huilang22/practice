/*
 * Generated code DO NOT EDIT
 * Generated file: JobResourcesGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a JobResourcesGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class JobResourcesGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected JobResourcesObjectData noOpIn;

/**
 *
 * Constructor to create a   JobResourcesGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public JobResourcesGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, JobResourcesObjectData noOpInIn) {
    super(id, context, "JobResourcesGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("JobResources", JobResourcesObjectHelper.toMap(noOpIn, new HashMap(), "JobResources").get("JobResources"));
    }
  }
/**
 *
 * Sets the  JobResources
 * @param noOpInIn JobResourcesObjectData to set
 *
 */
  public void setJobResources(JobResourcesObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the JobResources passed into the constructor
 * @return Simulated response
 *
 */
  public JobResourcesObjectData getJobResources() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = JobResourcesObjectHelper.fromMap(inputMap, "JobResources");
  }
}
