/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProjectInstanceGetBulkUdtTemplateItem.java
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
 * Class used to create a ProjectInstanceGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ProjectInstanceGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProjectInstanceObjectKeyData piGetIn;
/**
 *
 * Constructor to create a  ProjectInstanceGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProjectInstanceGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ProjectInstanceObjectKeyData piGetInIn) {
    super(id, context, "ProjectInstanceGet");
    piGetIn = piGetInIn;
  }

  public void translateToMap() {
    if (piGetIn != null) {
      piGetIn.resetFlags(true, true);
      addInput("ProjectInstance", ProjectInstanceObjectKeyHelper.toMap(piGetIn, new HashMap(), "ProjectInstanceObjectKeyData").get("ProjectInstanceObjectKeyData"));
    }
  }


/**
 *
 * Sets the ProjectInstance
 * @param piGetInIn Value of the piGetIn
 *
 */

  public void setProjectInstance(ProjectInstanceObjectKeyData piGetInIn) {
    piGetIn = piGetInIn;
  }

  public void translateFromMap() {
    piGetIn = ProjectInstanceObjectKeyHelper.fromMap(inputMap, "ProjectInstance");
  }

/**
 *
 * Gets the ProjectInstance
 * @return Value of the ProjectInstance
 *
 */

  public ProjectInstanceObjectKeyData getProjectInstance( ) {
    return piGetIn;
  }

}
