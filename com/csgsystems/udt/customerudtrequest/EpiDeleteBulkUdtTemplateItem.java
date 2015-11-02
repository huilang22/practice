/*
 * Generated code DO NOT EDIT
 * Generated file: EpiDeleteBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a EpiDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class EpiDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EpiObjectKeyData EpiDeleteIn;
/**
 *
 * Constructor to create a  EpiDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EpiDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, EpiObjectKeyData EpiDeleteInIn) {
    super(id, context, "EpiDelete");
    EpiDeleteIn = EpiDeleteInIn;
  }

  public void translateToMap() {
    if (EpiDeleteIn != null) {
      EpiDeleteIn.resetFlags(true, true);
      addInput("Epi", EpiObjectKeyHelper.toMap(EpiDeleteIn, new HashMap(), "EpiObjectKeyData").get("EpiObjectKeyData"));
    }
  }


/**
 *
 * Sets the Epi
 * @param EpiDeleteInIn Value of the EpiDeleteIn
 *
 */

  public void setEpi(EpiObjectKeyData EpiDeleteInIn) {
    EpiDeleteIn = EpiDeleteInIn;
  }

  public void translateFromMap() {
    EpiDeleteIn = EpiObjectKeyHelper.fromMap(inputMap, "Epi");
  }

/**
 *
 * Gets the Epi
 * @return Value of the Epi
 *
 */

  public EpiObjectKeyData getEpi( ) {
    return EpiDeleteIn;
  }

}
