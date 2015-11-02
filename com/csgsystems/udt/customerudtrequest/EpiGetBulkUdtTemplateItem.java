/*
 * Generated code DO NOT EDIT
 * Generated file: EpiGetBulkUdtTemplateItem.java
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
 * Class used to create a EpiGetBulkUdtTemplateItem Bulk Template
 *
 */

public class EpiGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EpiObjectKeyData EpiGetIn;
/**
 *
 * Constructor to create a  EpiGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EpiGetBulkUdtTemplateItem(String id, BSDMSessionContext context, EpiObjectKeyData EpiGetInIn) {
    super(id, context, "EpiGet");
    EpiGetIn = EpiGetInIn;
  }

  public void translateToMap() {
    if (EpiGetIn != null) {
      EpiGetIn.resetFlags(true, true);
      addInput("Epi", EpiObjectKeyHelper.toMap(EpiGetIn, new HashMap(), "EpiObjectKeyData").get("EpiObjectKeyData"));
    }
  }


/**
 *
 * Sets the Epi
 * @param EpiGetInIn Value of the EpiGetIn
 *
 */

  public void setEpi(EpiObjectKeyData EpiGetInIn) {
    EpiGetIn = EpiGetInIn;
  }

  public void translateFromMap() {
    EpiGetIn = EpiObjectKeyHelper.fromMap(inputMap, "Epi");
  }

/**
 *
 * Gets the Epi
 * @return Value of the Epi
 *
 */

  public EpiObjectKeyData getEpi( ) {
    return EpiGetIn;
  }

}
