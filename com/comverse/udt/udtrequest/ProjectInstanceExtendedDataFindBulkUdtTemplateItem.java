/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProjectInstanceExtendedDataFindBulkUdtTemplateItem.java
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
 * Class used to create a ProjectInstanceExtendedDataFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ProjectInstanceExtendedDataFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProjectInstanceObjectKeyData piedfIn;
/**
 *
 * Constructor to create a  ProjectInstanceExtendedDataFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProjectInstanceExtendedDataFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ProjectInstanceObjectKeyData piedfInIn) {
    super(id, context, "ProjectInstanceExtendedDataFind");
    piedfIn = piedfInIn;
  }

  public void translateToMap() {
    if (piedfIn != null) {
      piedfIn.resetFlags(true, true);
      addInput("ProjectInstance", ProjectInstanceObjectKeyHelper.toMap(piedfIn, new HashMap(), "ProjectInstanceObjectKeyData").get("ProjectInstanceObjectKeyData"));
    }
  }


/**
 *
 * Sets the ProjectInstance
 * @param piedfInIn Value of the piedfIn
 *
 */

  public void setProjectInstance(ProjectInstanceObjectKeyData piedfInIn) {
    piedfIn = piedfInIn;
  }

  public void translateFromMap() {
    piedfIn = ProjectInstanceObjectKeyHelper.fromMap(inputMap, "ProjectInstance");
  }

/**
 *
 * Gets the ProjectInstance
 * @return Value of the ProjectInstance
 *
 */

  public ProjectInstanceObjectKeyData getProjectInstance( ) {
    return piedfIn;
  }

}
