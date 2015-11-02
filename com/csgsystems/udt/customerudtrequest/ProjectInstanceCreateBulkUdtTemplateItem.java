/*
 * Generated code DO NOT EDIT
 * Generated file: ProjectInstanceCreateBulkUdtTemplateItem.java
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
 * Class used to create a ProjectInstanceCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ProjectInstanceCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProjectInstanceObjectData piCreateIn;
/**
 *
 * Constructor to create a  ProjectInstanceCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProjectInstanceCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ProjectInstanceObjectData piCreateInIn) {
    super(id, context, "ProjectInstanceCreate");
    piCreateIn = piCreateInIn;
  }

  public void translateToMap() {
    if (piCreateIn != null) {
      piCreateIn.resetFlags(true, true);
      addInput("ProjectInstance", ProjectInstanceObjectHelper.toMap(piCreateIn, new HashMap(), "ProjectInstance").get("ProjectInstance"));
    }
  }


/**
 *
 * Sets the ProjectInstance
 * @param piCreateInIn Value of the piCreateIn
 *
 */

  public void setProjectInstance(ProjectInstanceObjectData piCreateInIn) {
    piCreateIn = piCreateInIn;
  }

  public void translateFromMap() {
    piCreateIn = ProjectInstanceObjectHelper.fromMap(inputMap, "ProjectInstance");
  }

/**
 *
 * Gets the ProjectInstance
 * @return Value of the ProjectInstance
 *
 */

  public ProjectInstanceObjectData getProjectInstance( ) {
    return piCreateIn;
  }

}
