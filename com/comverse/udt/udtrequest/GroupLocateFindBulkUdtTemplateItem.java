/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GroupLocateFindBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a GroupLocateFindBulkUdtTemplateItem Bulk Template
 *
 */

public class GroupLocateFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GroupLocateObjectFilter GLFindIn;
/**
 *
 * Constructor to create a  GroupLocateFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GroupLocateFindBulkUdtTemplateItem(String id, BSDMSessionContext context, GroupLocateObjectFilter GLFindInIn) {
    super(id, context, "GroupLocateFind");
    GLFindIn = GLFindInIn;
  }

  public void translateToMap() {
    if (GLFindIn != null) {
      Integer index =  GLFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("GroupLocate", GroupLocateObjectHelper.toMap(GLFindIn, new HashMap(), "GroupLocate").get("GroupLocate"));
    }
  }


/**
 *
 * Sets the GroupLocate
 * @param GLFindInIn Value of the GLFindIn
 *
 */

  public void setGroupLocate(GroupLocateObjectFilter GLFindInIn) {
    GLFindIn = GLFindInIn;
  }

  public void translateFromMap() {
    GLFindIn = GroupLocateObjectHelper.fromMapFilter(inputMap, "GroupLocate");
  }

/**
 *
 * Gets the GroupLocate
 * @return Value of the GroupLocate
 *
 */

  public GroupLocateObjectFilter getGroupLocate( ) {
    return GLFindIn;
  }

}
