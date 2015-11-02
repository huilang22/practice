/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvContainerRelationsFindBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvContainerRelationsFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvContainerRelationsFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvContainerObjectFilter InvContainerFindIn;
/**
 *
 * Constructor to create a  InvContainerRelationsFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvContainerRelationsFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvContainerObjectFilter InvContainerFindInIn) {
    super(id, context, "InvContainerRelationsFind");
    InvContainerFindIn = InvContainerFindInIn;
  }

  public void translateToMap() {
    if (InvContainerFindIn != null) {
      Integer index =  InvContainerFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvContainer", InvContainerObjectHelper.toMap(InvContainerFindIn, new HashMap(), "InvContainer").get("InvContainer"));
    }
  }


/**
 *
 * Sets the InvContainer
 * @param InvContainerFindInIn Value of the InvContainerFindIn
 *
 */

  public void setInvContainer(InvContainerObjectFilter InvContainerFindInIn) {
    InvContainerFindIn = InvContainerFindInIn;
  }

  public void translateFromMap() {
    InvContainerFindIn = InvContainerObjectHelper.fromMapFilter(inputMap, "InvContainer");
  }

/**
 *
 * Gets the InvContainer
 * @return Value of the InvContainer
 *
 */

  public InvContainerObjectFilter getInvContainer( ) {
    return InvContainerFindIn;
  }

}
