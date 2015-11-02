/*
 * Generated code DO NOT EDIT
 * Generated file: ProjectInstanceExtendedDataFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ProjectInstanceExtendedDataFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ProjectInstanceExtendedDataFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ProjectInstanceEDObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ProjectInstanceExtendedDataFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ProjectInstanceExtendedDataFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ProjectInstanceEDObjectDataList noOpInIn) {
    super(id, context, "ProjectInstanceExtendedDataFind");
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
        mapArray[i] = ProjectInstanceEDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ProjectInstanceExtendedData", noOpIn);
      }
      addInput("ProjectInstanceExtendedData", mapList);
    }
  }
/**
 *
 * Sets the  ProjectInstanceExtendedData
 * @param noOpInIn ProjectInstanceEDObjectDataList to set
 *
 */
  public void setProjectInstanceExtendedData(ProjectInstanceEDObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ProjectInstanceExtendedData passed into the constructor
 * @return Simulated response
 *
 */
  public ProjectInstanceEDObjectDataList getProjectInstanceExtendedData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ProjectInstanceEDObjectHelper.fromMapList(inputMap, "ProjectInstanceExtendedDataList");
  }
}
