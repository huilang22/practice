/*
 * Generated code DO NOT EDIT
 * Generated file: NrcRefinanceCreateBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a NrcRefinanceCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class NrcRefinanceCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NrcObjectBaseData NrcRNrcIn;
  protected BalanceLineItemObjectData[] NrcRBLIIn;
/**
 *
 * Constructor to create a  NrcRefinanceCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NrcRefinanceCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcObjectBaseData NrcRNrcInIn, BalanceLineItemObjectData[] NrcRBLIInIn) {
    super(id, context, "NrcRefinanceCreate");
    NrcRNrcIn = NrcRNrcInIn;
    NrcRBLIIn = NrcRBLIInIn;
  }

  public void translateToMap() {
    if (NrcRNrcIn != null) {
      NrcRNrcIn.resetFlags(true, true);
      addInput("Nrc", NrcObjectBaseHelper.toMap(NrcRNrcIn, new HashMap(), "Nrc").get("Nrc"));
    }
    if (NrcRBLIIn != null) {
      if (NrcRBLIIn != null) {
        Object[] list = new Object[NrcRBLIIn.length];
        for (int i = 0; i < NrcRBLIIn.length; i++) {
          list[i] = BalanceLineItemObjectHelper.getMap(NrcRBLIIn[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "Nrc");
        }
        addInput("BalanceLineItemList", list);
      }
    }
  }


/**
 *
 * Sets the Nrc
 * @param NrcRNrcInIn Value of the NrcRNrcIn
 *
 */

  public void setNrc(NrcObjectBaseData NrcRNrcInIn) {
    NrcRNrcIn = NrcRNrcInIn;
  }

/**
 *
 * Sets the BalanceLineItem
 * @param NrcRBLIInIn Value of the NrcRBLIIn
 *
 */

  public void setBalanceLineItem(BalanceLineItemObjectData[] NrcRBLIInIn) {
    NrcRBLIIn = NrcRBLIInIn;
  }

  public void translateFromMap() {
    NrcRNrcIn = NrcObjectBaseHelper.fromMap(inputMap, "Nrc");
    Object[] list = (Object[]) inputMap.get("BalanceLineItemList");
    if (list != null) {
      NrcRBLIIn = new BalanceLineItemObjectData[list.length];
      for (int i = 0; i < list.length; i++) {
        NrcRBLIIn[i] = BalanceLineItemObjectHelper.getObj((Map) list[i]);
        NrcRBLIIn[i].resetFlags(true, true);
      }
    }
  }

/**
 *
 * Gets the Nrc
 * @return Value of the Nrc
 *
 */

  public NrcObjectBaseData getNrc( ) {
    return NrcRNrcIn;
  }

/**
 *
 * Gets the BalanceLineItem
 * @return Value of the BalanceLineItem
 *
 */

  public BalanceLineItemObjectData[] getBalanceLineItem( ) {
    return NrcRBLIIn;
  }

}
