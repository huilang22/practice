/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountLocateFindByOrderNumberBulkUdtTemplateItem.java
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
 * Class used to create a AccountLocateFindByOrderNumberBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountLocateFindByOrderNumberBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OrderLocateXIDObjectFilter alonIn;
/**
 *
 * Constructor to create a  AccountLocateFindByOrderNumberBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountLocateFindByOrderNumberBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderLocateXIDObjectFilter alonInIn) {
    super(id, context, "AccountLocateFindByOrderNumber");
    alonIn = alonInIn;
  }

  public void translateToMap() {
    if (alonIn != null) {
      Integer index =  alonIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountLocate", OrderLocateXIDObjectHelper.toMap(alonIn, new HashMap(), "AccountLocate").get("AccountLocate"));
    }
  }


/**
 *
 * Sets the AccountLocate
 * @param alonInIn Value of the alonIn
 *
 */

  public void setAccountLocate(OrderLocateXIDObjectFilter alonInIn) {
    alonIn = alonInIn;
  }

  public void translateFromMap() {
    alonIn = OrderLocateXIDObjectHelper.fromMapFilter(inputMap, "AccountLocate");
  }

/**
 *
 * Gets the AccountLocate
 * @return Value of the AccountLocate
 *
 */

  public OrderLocateXIDObjectFilter getAccountLocate( ) {
    return alonIn;
  }

}
