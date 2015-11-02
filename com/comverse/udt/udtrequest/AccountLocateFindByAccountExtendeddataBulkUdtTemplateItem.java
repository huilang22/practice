/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountLocateFindByAccountExtendeddataBulkUdtTemplateItem.java
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
 * Class used to create a AccountLocateFindByAccountExtendeddataBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountLocateFindByAccountExtendeddataBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountExtendedDataLocateXIDObjectFilter alaedfIn;
/**
 *
 * Constructor to create a  AccountLocateFindByAccountExtendeddataBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountLocateFindByAccountExtendeddataBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountExtendedDataLocateXIDObjectFilter alaedfInIn) {
    super(id, context, "AccountLocateFindByAccountExtendeddata");
    alaedfIn = alaedfInIn;
  }

  public void translateToMap() {
    if (alaedfIn != null) {
      Integer index =  alaedfIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountLocate", AccountExtendedDataLocateXIDObjectHelper.toMap(alaedfIn, new HashMap(), "AccountLocate").get("AccountLocate"));
    }
  }


/**
 *
 * Sets the AccountLocate
 * @param alaedfInIn Value of the alaedfIn
 *
 */

  public void setAccountLocate(AccountExtendedDataLocateXIDObjectFilter alaedfInIn) {
    alaedfIn = alaedfInIn;
  }

  public void translateFromMap() {
    alaedfIn = AccountExtendedDataLocateXIDObjectHelper.fromMapFilter(inputMap, "AccountLocate");
  }

/**
 *
 * Gets the AccountLocate
 * @return Value of the AccountLocate
 *
 */

  public AccountExtendedDataLocateXIDObjectFilter getAccountLocate( ) {
    return alaedfIn;
  }

}
