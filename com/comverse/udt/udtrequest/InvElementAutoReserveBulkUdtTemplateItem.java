/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementAutoReserveBulkUdtTemplateItem.java
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
 * Class used to create a InvElementAutoReserveBulkUdtTemplateItem Bulk Template
 *
 */

public class InvElementAutoReserveBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvElementObjFilter InvAutoRsrvIn;
  protected Integer Quantity;
  protected Integer ContiguousFlag;
/**
 *
 * Constructor to create a  InvElementAutoReserveBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvElementAutoReserveBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementObjFilter InvAutoRsrvInIn, Integer QuantityIn, Integer ContiguousFlagIn) {
    super(id, context, "InvElementAutoReserve");
    InvAutoRsrvIn = InvAutoRsrvInIn;
    Quantity = QuantityIn;
    ContiguousFlag = ContiguousFlagIn;
  }

  public void translateToMap() {
    if (InvAutoRsrvIn != null) {
      Integer index =  InvAutoRsrvIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvElement", InvElementObjHelper.toMap(InvAutoRsrvIn, new HashMap(), "Void").get("Void"));
    }
    if (Quantity != null) {
      addInput("Quantity", Quantity);
    }
    if (ContiguousFlag != null) {
      addInput("ContiguousFlag", ContiguousFlag);
    }
  }


/**
 *
 * Sets the InvElement
 * @param InvAutoRsrvInIn Value of the InvAutoRsrvIn
 *
 */

  public void setInvElement(InvElementObjFilter InvAutoRsrvInIn) {
    InvAutoRsrvIn = InvAutoRsrvInIn;
  }

/**
 *
 * Sets the Quantity
 * @param QuantityIn Value of the Quantity
 *
 */

  public void setQuantity(Integer QuantityIn) {
    Quantity = QuantityIn;
  }

/**
 *
 * Sets the ContiguousFlag
 * @param ContiguousFlagIn Value of the ContiguousFlag
 *
 */

  public void setContiguousFlag(Integer ContiguousFlagIn) {
    ContiguousFlag = ContiguousFlagIn;
  }

  public void translateFromMap() {
    InvAutoRsrvIn = InvElementObjHelper.fromMapFilter(inputMap, "InvElement");
    Quantity = (Integer)inputMap.get("Quantity");
    ContiguousFlag = (Integer)inputMap.get("ContiguousFlag");
  }

/**
 *
 * Gets the InvElement
 * @return Value of the InvElement
 *
 */

  public InvElementObjFilter getInvElement( ) {
    return InvAutoRsrvIn;
  }

/**
 *
 * Gets the Quantity
 * @return Value of the Quantity
 *
 */

  public Integer getQuantity( ) {
    return Quantity;
  }

/**
 *
 * Gets the ContiguousFlag
 * @return Value of the ContiguousFlag
 *
 */

  public Integer getContiguousFlag( ) {
    return ContiguousFlag;
  }

}
