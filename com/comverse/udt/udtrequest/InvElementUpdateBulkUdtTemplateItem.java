/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvElementUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvElementUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvElementObjData InvUpdIn;
/**
 *
 * Constructor to create a  InvElementUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvElementUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementObjData InvUpdInIn) {
    super(id, context, "InvElementUpdate");
    InvUpdIn = InvUpdInIn;
  }

  public void translateToMap() {
    if (InvUpdIn != null) {
      InvUpdIn.resetFlags(true, true);
      addInput("InvElement", InvElementObjHelper.toMap(InvUpdIn, new HashMap(), "InvElement").get("InvElement"));
    }
  }


/**
 *
 * Sets the InvElement
 * @param InvUpdInIn Value of the InvUpdIn
 *
 */

  public void setInvElement(InvElementObjData InvUpdInIn) {
    InvUpdIn = InvUpdInIn;
  }

  public void translateFromMap() {
    InvUpdIn = InvElementObjHelper.fromMap(inputMap, "InvElement");
  }

/**
 *
 * Gets the InvElement
 * @return Value of the InvElement
 *
 */

  public InvElementObjData getInvElement( ) {
    return InvUpdIn;
  }

}
