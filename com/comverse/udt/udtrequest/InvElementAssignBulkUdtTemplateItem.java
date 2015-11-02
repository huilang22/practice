/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementAssignBulkUdtTemplateItem.java
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
 * Class used to create a InvElementAssignBulkUdtTemplateItem Bulk Template
 *
 */

public class InvElementAssignBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvElementObjData InvAsgnIn;
/**
 *
 * Constructor to create a  InvElementAssignBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvElementAssignBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementObjData InvAsgnInIn) {
    super(id, context, "InvElementAssign");
    InvAsgnIn = InvAsgnInIn;
  }

  public void translateToMap() {
    if (InvAsgnIn != null) {
      InvAsgnIn.resetFlags(true, true);
      addInput("InvElement", InvElementObjHelper.toMap(InvAsgnIn, new HashMap(), "InvElement").get("InvElement"));
    }
  }


/**
 *
 * Sets the InvElement
 * @param InvAsgnInIn Value of the InvAsgnIn
 *
 */

  public void setInvElement(InvElementObjData InvAsgnInIn) {
    InvAsgnIn = InvAsgnInIn;
  }

  public void translateFromMap() {
    InvAsgnIn = InvElementObjHelper.fromMap(inputMap, "InvElement");
  }

/**
 *
 * Gets the InvElement
 * @return Value of the InvElement
 *
 */

  public InvElementObjData getInvElement( ) {
    return InvAsgnIn;
  }

}
