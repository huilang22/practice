/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountLocateFindByAddressIdBulkUdtTemplateItem.java
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
 * Class used to create a AccountLocateFindByAddressIdBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountLocateFindByAddressIdBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AddressLocateXIDObjectFilter alafIn;
/**
 *
 * Constructor to create a  AccountLocateFindByAddressIdBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountLocateFindByAddressIdBulkUdtTemplateItem(String id, BSDMSessionContext context, AddressLocateXIDObjectFilter alafInIn) {
    super(id, context, "AccountLocateFindByAddressId");
    alafIn = alafInIn;
  }

  public void translateToMap() {
    if (alafIn != null) {
      Integer index =  alafIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AlafIn", AddressLocateXIDObjectHelper.toMap(alafIn, new HashMap(), "AccountLocate").get("AccountLocate"));
    }
  }


/**
 *
 * Sets the AlafIn
 * @param alafInIn Value of the alafIn
 *
 */

  public void setAlafIn(AddressLocateXIDObjectFilter alafInIn) {
    alafIn = alafInIn;
  }

  public void translateFromMap() {
    alafIn = AddressLocateXIDObjectHelper.fromMapFilter(inputMap, "AlafIn");
  }

/**
 *
 * Gets the AlafIn
 * @return Value of the AlafIn
 *
 */

  public AddressLocateXIDObjectFilter getAlafIn( ) {
    return alafIn;
  }

}
