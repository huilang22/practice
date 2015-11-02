/*
 * Generated code DO NOT EDIT
 * Generated file: ProjectChargeDetailFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a ProjectChargeDetailFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ProjectChargeDetailFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ProjectChargeDetailObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ProjectChargeDetailFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ProjectChargeDetailFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ProjectChargeDetailObjectDataList noOpInIn) {
    super(id, context, "ProjectChargeDetailFind");
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
        mapArray[i] = ProjectChargeDetailObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ProjectChargeDetail", noOpIn);
      }
      addInput("ProjectChargeDetail", mapList);
    }
  }
/**
 *
 * Sets the  ProjectChargeDetail
 * @param noOpInIn ProjectChargeDetailObjectDataList to set
 *
 */
  public void setProjectChargeDetail(ProjectChargeDetailObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ProjectChargeDetail passed into the constructor
 * @return Simulated response
 *
 */
  public ProjectChargeDetailObjectDataList getProjectChargeDetail() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ProjectChargeDetailObjectHelper.fromMapList(inputMap, "ProjectChargeDetailList");
  }
}
