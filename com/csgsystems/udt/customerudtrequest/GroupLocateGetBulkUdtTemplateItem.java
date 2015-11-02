/*
 * Generated code DO NOT EDIT
 * Generated file: GroupLocateGetBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a GroupLocateGetBulkUdtTemplateItem Bulk Template
 *
 */

public class GroupLocateGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GroupLocateObjectKeyData GLGetIn;
/**
 *
 * Constructor to create a  GroupLocateGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GroupLocateGetBulkUdtTemplateItem(String id, BSDMSessionContext context, GroupLocateObjectKeyData GLGetInIn) {
    super(id, context, "GroupLocateGet");
    GLGetIn = GLGetInIn;
  }

  public void translateToMap() {
    if (GLGetIn != null) {
      GLGetIn.resetFlags(true, true);
      addInput("GroupLocate", GroupLocateObjectKeyHelper.toMap(GLGetIn, new HashMap(), "GroupLocateObjectKeyData").get("GroupLocateObjectKeyData"));
    }
  }


/**
 *
 * Sets the GroupLocate
 * @param GLGetInIn Value of the GLGetIn
 *
 */

  public void setGroupLocate(GroupLocateObjectKeyData GLGetInIn) {
    GLGetIn = GLGetInIn;
  }

  public void translateFromMap() {
    GLGetIn = GroupLocateObjectKeyHelper.fromMap(inputMap, "GroupLocate");
  }

/**
 *
 * Gets the GroupLocate
 * @return Value of the GroupLocate
 *
 */

  public GroupLocateObjectKeyData getGroupLocate( ) {
    return GLGetIn;
  }

}
