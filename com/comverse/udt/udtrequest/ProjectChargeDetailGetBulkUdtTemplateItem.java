/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProjectChargeDetailGetBulkUdtTemplateItem.java
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
 * Class used to create a ProjectChargeDetailGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ProjectChargeDetailGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProjectChargeDetailObjectKeyData ProjectChargeDetailGetIn;
/**
 *
 * Constructor to create a  ProjectChargeDetailGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProjectChargeDetailGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ProjectChargeDetailObjectKeyData ProjectChargeDetailGetInIn) {
    super(id, context, "ProjectChargeDetailGet");
    ProjectChargeDetailGetIn = ProjectChargeDetailGetInIn;
  }

  public void translateToMap() {
    if (ProjectChargeDetailGetIn != null) {
      ProjectChargeDetailGetIn.resetFlags(true, true);
      addInput("ProjectChargeDetail", ProjectChargeDetailObjectKeyHelper.toMap(ProjectChargeDetailGetIn, new HashMap(), "ProjectChargeDetailObjectKeyData").get("ProjectChargeDetailObjectKeyData"));
    }
  }


/**
 *
 * Sets the ProjectChargeDetail
 * @param ProjectChargeDetailGetInIn Value of the ProjectChargeDetailGetIn
 *
 */

  public void setProjectChargeDetail(ProjectChargeDetailObjectKeyData ProjectChargeDetailGetInIn) {
    ProjectChargeDetailGetIn = ProjectChargeDetailGetInIn;
  }

  public void translateFromMap() {
    ProjectChargeDetailGetIn = ProjectChargeDetailObjectKeyHelper.fromMap(inputMap, "ProjectChargeDetail");
  }

/**
 *
 * Gets the ProjectChargeDetail
 * @return Value of the ProjectChargeDetail
 *
 */

  public ProjectChargeDetailObjectKeyData getProjectChargeDetail( ) {
    return ProjectChargeDetailGetIn;
  }

}
