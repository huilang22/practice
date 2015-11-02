/*
 * Generated code DO NOT EDIT
 * Generated file: ProjectChargeDetailUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ProjectChargeDetailUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ProjectChargeDetailUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ProjectChargeDetailObjectData noOpIn;

/**
 *
 * Constructor to create a   ProjectChargeDetailUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ProjectChargeDetailUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ProjectChargeDetailObjectData noOpInIn) {
    super(id, context, "ProjectChargeDetailUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ProjectChargeDetail", ProjectChargeDetailObjectHelper.toMap(noOpIn, new HashMap(), "ProjectChargeDetail").get("ProjectChargeDetail"));
    }
  }
/**
 *
 * Sets the  ProjectChargeDetail
 * @param noOpInIn ProjectChargeDetailObjectData to set
 *
 */
  public void setProjectChargeDetail(ProjectChargeDetailObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ProjectChargeDetail passed into the constructor
 * @return Simulated response
 *
 */
  public ProjectChargeDetailObjectData getProjectChargeDetail() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ProjectChargeDetailObjectHelper.fromMap(inputMap, "ProjectChargeDetail");
  }
}
