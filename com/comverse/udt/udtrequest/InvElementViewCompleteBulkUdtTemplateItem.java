/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementViewCompleteBulkUdtTemplateItem.java
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
 * Class used to create a InvElementViewCompleteBulkUdtTemplateItem Bulk Template
 *
 */

public class InvElementViewCompleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvElementObjKeyData InvViewComplIn;
/**
 *
 * Constructor to create a  InvElementViewCompleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvElementViewCompleteBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementObjKeyData InvViewComplInIn) {
    super(id, context, "InvElementViewComplete");
    InvViewComplIn = InvViewComplInIn;
  }

  public void translateToMap() {
    if (InvViewComplIn != null) {
      InvViewComplIn.resetFlags(true, true);
      addInput("InvElement", InvElementObjKeyHelper.toMap(InvViewComplIn, new HashMap(), "InvElementObjKeyData").get("InvElementObjKeyData"));
    }
  }


/**
 *
 * Sets the InvElement
 * @param InvViewComplInIn Value of the InvViewComplIn
 *
 */

  public void setInvElement(InvElementObjKeyData InvViewComplInIn) {
    InvViewComplIn = InvViewComplInIn;
  }

  public void translateFromMap() {
    InvViewComplIn = InvElementObjKeyHelper.fromMap(inputMap, "InvElement");
  }

/**
 *
 * Gets the InvElement
 * @return Value of the InvElement
 *
 */

  public InvElementObjKeyData getInvElement( ) {
    return InvViewComplIn;
  }

}
