/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvAutoActionFindBulkUdtTemplateItem.java
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
 * Class used to create a InvAutoActionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvAutoActionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvAutoActionObjData InvAutoActionFindIn;
/**
 *
 * Constructor to create a  InvAutoActionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvAutoActionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvAutoActionObjData InvAutoActionFindInIn) {
    super(id, context, "InvAutoActionFind");
    InvAutoActionFindIn = InvAutoActionFindInIn;
  }

  public void translateToMap() {
    if (InvAutoActionFindIn != null) {
      InvAutoActionFindIn.resetFlags(true, true);
      addInput("InvAutoAction", InvAutoActionObjHelper.toMap(InvAutoActionFindIn, new HashMap(), "InvAutoAction").get("InvAutoAction"));
    }
  }


/**
 *
 * Sets the InvAutoAction
 * @param InvAutoActionFindInIn Value of the InvAutoActionFindIn
 *
 */

  public void setInvAutoAction(InvAutoActionObjData InvAutoActionFindInIn) {
    InvAutoActionFindIn = InvAutoActionFindInIn;
  }

  public void translateFromMap() {
    InvAutoActionFindIn = InvAutoActionObjHelper.fromMap(inputMap, "InvAutoAction");
  }

/**
 *
 * Gets the InvAutoAction
 * @return Value of the InvAutoAction
 *
 */

  public InvAutoActionObjData getInvAutoAction( ) {
    return InvAutoActionFindIn;
  }

}
