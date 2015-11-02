/*
 * Generated code DO NOT EDIT
 * Generated file: ProjectInstanceFindBulkUdtTemplateItem.java
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
 * Class used to create a ProjectInstanceFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ProjectInstanceFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProjectInstanceObjectFilter piFindIn;
/**
 *
 * Constructor to create a  ProjectInstanceFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProjectInstanceFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ProjectInstanceObjectFilter piFindInIn) {
    super(id, context, "ProjectInstanceFind");
    piFindIn = piFindInIn;
  }

  public void translateToMap() {
    if (piFindIn != null) {
      Integer index =  piFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ProjectInstance", ProjectInstanceObjectHelper.toMap(piFindIn, new HashMap(), "ProjectInstance").get("ProjectInstance"));
    }
  }


/**
 *
 * Sets the ProjectInstance
 * @param piFindInIn Value of the piFindIn
 *
 */

  public void setProjectInstance(ProjectInstanceObjectFilter piFindInIn) {
    piFindIn = piFindInIn;
  }

  public void translateFromMap() {
    piFindIn = ProjectInstanceObjectHelper.fromMapFilter(inputMap, "ProjectInstance");
  }

/**
 *
 * Gets the ProjectInstance
 * @return Value of the ProjectInstance
 *
 */

  public ProjectInstanceObjectFilter getProjectInstance( ) {
    return piFindIn;
  }

}
