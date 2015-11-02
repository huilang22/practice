/*
 * Generated code DO NOT EDIT
 * Generated file: ProjectInstanceUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ProjectInstanceUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ProjectInstanceUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProjectInstanceObjectData piUpdateIn;
/**
 *
 * Constructor to create a  ProjectInstanceUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProjectInstanceUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ProjectInstanceObjectData piUpdateInIn) {
    super(id, context, "ProjectInstanceUpdate");
    piUpdateIn = piUpdateInIn;
  }

  public void translateToMap() {
    if (piUpdateIn != null) {
      piUpdateIn.resetFlags(true, true);
      addInput("ProjectInstance", ProjectInstanceObjectHelper.toMap(piUpdateIn, new HashMap(), "ProjectInstance").get("ProjectInstance"));
    }
  }


/**
 *
 * Sets the ProjectInstance
 * @param piUpdateInIn Value of the piUpdateIn
 *
 */

  public void setProjectInstance(ProjectInstanceObjectData piUpdateInIn) {
    piUpdateIn = piUpdateInIn;
  }

  public void translateFromMap() {
    piUpdateIn = ProjectInstanceObjectHelper.fromMap(inputMap, "ProjectInstance");
  }

/**
 *
 * Gets the ProjectInstance
 * @return Value of the ProjectInstance
 *
 */

  public ProjectInstanceObjectData getProjectInstance( ) {
    return piUpdateIn;
  }

}
