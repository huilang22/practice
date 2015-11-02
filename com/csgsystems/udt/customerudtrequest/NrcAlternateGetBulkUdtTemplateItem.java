/*
 * Generated code DO NOT EDIT
 * Generated file: NrcAlternateGetBulkUdtTemplateItem.java
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
 * Class used to create a NrcAlternateGetBulkUdtTemplateItem Bulk Template
 *
 */

public class NrcAlternateGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NrcObjectBaseData NrcAlternateGetIn;
/**
 *
 * Constructor to create a  NrcAlternateGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NrcAlternateGetBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcObjectBaseData NrcAlternateGetInIn) {
    super(id, context, "NrcAlternateGet");
    NrcAlternateGetIn = NrcAlternateGetInIn;
  }

  public void translateToMap() {
    if (NrcAlternateGetIn != null) {
      NrcAlternateGetIn.resetFlags(true, true);
      addInput("Nrc", NrcObjectBaseHelper.toMap(NrcAlternateGetIn, new HashMap(), "Nrc").get("Nrc"));
    }
  }


/**
 *
 * Sets the Nrc
 * @param NrcAlternateGetInIn Value of the NrcAlternateGetIn
 *
 */

  public void setNrc(NrcObjectBaseData NrcAlternateGetInIn) {
    NrcAlternateGetIn = NrcAlternateGetInIn;
  }

  public void translateFromMap() {
    NrcAlternateGetIn = NrcObjectBaseHelper.fromMap(inputMap, "Nrc");
  }

/**
 *
 * Gets the Nrc
 * @return Value of the Nrc
 *
 */

  public NrcObjectBaseData getNrc( ) {
    return NrcAlternateGetIn;
  }

}
