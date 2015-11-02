/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProjectInstanceFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a ProjectInstanceFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ProjectInstanceFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ProjectInstanceObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ProjectInstanceFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ProjectInstanceFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ProjectInstanceObjectDataList noOpInIn) {
    super(id, context, "ProjectInstanceFind");
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
        mapArray[i] = ProjectInstanceObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ProjectInstance", noOpIn);
      }
      addInput("ProjectInstance", mapList);
    }
  }
/**
 *
 * Sets the  ProjectInstance
 * @param noOpInIn ProjectInstanceObjectDataList to set
 *
 */
  public void setProjectInstance(ProjectInstanceObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ProjectInstance passed into the constructor
 * @return Simulated response
 *
 */
  public ProjectInstanceObjectDataList getProjectInstance() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ProjectInstanceObjectHelper.fromMapList(inputMap, "ProjectInstanceList");
  }
}
