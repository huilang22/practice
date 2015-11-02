/*
 * Generated code DO NOT EDIT
 * Generated file: ProjectChargeDetailUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ProjectChargeDetailUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ProjectChargeDetailUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProjectChargeDetailObjectData ProjectChargeDetailUpdateIn;
/**
 *
 * Constructor to create a  ProjectChargeDetailUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProjectChargeDetailUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ProjectChargeDetailObjectData ProjectChargeDetailUpdateInIn) {
    super(id, context, "ProjectChargeDetailUpdate");
    ProjectChargeDetailUpdateIn = ProjectChargeDetailUpdateInIn;
  }

  public void translateToMap() {
    if (ProjectChargeDetailUpdateIn != null) {
      ProjectChargeDetailUpdateIn.resetFlags(true, true);
      addInput("ProjectChargeDetail", ProjectChargeDetailObjectHelper.toMap(ProjectChargeDetailUpdateIn, new HashMap(), "ProjectChargeDetail").get("ProjectChargeDetail"));
    }
  }


/**
 *
 * Sets the ProjectChargeDetail
 * @param ProjectChargeDetailUpdateInIn Value of the ProjectChargeDetailUpdateIn
 *
 */

  public void setProjectChargeDetail(ProjectChargeDetailObjectData ProjectChargeDetailUpdateInIn) {
    ProjectChargeDetailUpdateIn = ProjectChargeDetailUpdateInIn;
  }

  public void translateFromMap() {
    ProjectChargeDetailUpdateIn = ProjectChargeDetailObjectHelper.fromMap(inputMap, "ProjectChargeDetail");
  }

/**
 *
 * Gets the ProjectChargeDetail
 * @return Value of the ProjectChargeDetail
 *
 */

  public ProjectChargeDetailObjectData getProjectChargeDetail( ) {
    return ProjectChargeDetailUpdateIn;
  }

}
