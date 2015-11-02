/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProjectChargeDetailFindBulkUdtTemplateItem.java
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
 * Class used to create a ProjectChargeDetailFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ProjectChargeDetailFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProjectChargeDetailObjectFilter ProjectChargeDetailFindIn;
/**
 *
 * Constructor to create a  ProjectChargeDetailFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProjectChargeDetailFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ProjectChargeDetailObjectFilter ProjectChargeDetailFindInIn) {
    super(id, context, "ProjectChargeDetailFind");
    ProjectChargeDetailFindIn = ProjectChargeDetailFindInIn;
  }

  public void translateToMap() {
    if (ProjectChargeDetailFindIn != null) {
      Integer index =  ProjectChargeDetailFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ProjectChargeDetail", ProjectChargeDetailObjectHelper.toMap(ProjectChargeDetailFindIn, new HashMap(), "ProjectChargeDetail").get("ProjectChargeDetail"));
    }
  }


/**
 *
 * Sets the ProjectChargeDetail
 * @param ProjectChargeDetailFindInIn Value of the ProjectChargeDetailFindIn
 *
 */

  public void setProjectChargeDetail(ProjectChargeDetailObjectFilter ProjectChargeDetailFindInIn) {
    ProjectChargeDetailFindIn = ProjectChargeDetailFindInIn;
  }

  public void translateFromMap() {
    ProjectChargeDetailFindIn = ProjectChargeDetailObjectHelper.fromMapFilter(inputMap, "ProjectChargeDetail");
  }

/**
 *
 * Gets the ProjectChargeDetail
 * @return Value of the ProjectChargeDetail
 *
 */

  public ProjectChargeDetailObjectFilter getProjectChargeDetail( ) {
    return ProjectChargeDetailFindIn;
  }

}
