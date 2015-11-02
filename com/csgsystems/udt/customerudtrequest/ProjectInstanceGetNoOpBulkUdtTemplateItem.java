/*
 * Generated code DO NOT EDIT
 * Generated file: ProjectInstanceGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ProjectInstanceGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ProjectInstanceGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ProjectInstanceObjectData noOpIn;

/**
 *
 * Constructor to create a   ProjectInstanceGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ProjectInstanceGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ProjectInstanceObjectData noOpInIn) {
    super(id, context, "ProjectInstanceGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ProjectInstance", ProjectInstanceObjectHelper.toMap(noOpIn, new HashMap(), "ProjectInstance").get("ProjectInstance"));
    }
  }
/**
 *
 * Sets the  ProjectInstance
 * @param noOpInIn ProjectInstanceObjectData to set
 *
 */
  public void setProjectInstance(ProjectInstanceObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ProjectInstance passed into the constructor
 * @return Simulated response
 *
 */
  public ProjectInstanceObjectData getProjectInstance() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ProjectInstanceObjectHelper.fromMap(inputMap, "ProjectInstance");
  }
}
