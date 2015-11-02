/*
 * Generated code DO NOT EDIT
 * Generated file: JobResourcesFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a JobResourcesFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class JobResourcesFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected JobResourcesObjectDataList noOpIn;

/**
 *
 * Constructor to create a   JobResourcesFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public JobResourcesFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, JobResourcesObjectDataList noOpInIn) {
    super(id, context, "JobResourcesFind");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
          noOpIn.getArray()[i].resetFlags(true, true);
        mapArray[i] = JobResourcesObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("JobResources", noOpIn);
      }
      addInput("JobResources", mapList);
    }
  }
/**
 *
 * Sets the  JobResources
 * @param noOpInIn JobResourcesObjectDataList to set
 *
 */
  public void setJobResources(JobResourcesObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the JobResources passed into the constructor
 * @return Simulated response
 *
 */
  public JobResourcesObjectDataList getJobResources() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = JobResourcesObjectHelper.fromMapList(inputMap, "JobResourcesList");
  }
}
