/*
 * Generated code DO NOT EDIT
 * Generated file: NrcUpdateBulkUdtTemplateItem.java
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
 * Class used to create a NrcUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class NrcUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NrcObjectBaseData NrcUpdateIn;
/**
 *
 * Constructor to create a  NrcUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NrcUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcObjectBaseData NrcUpdateInIn) {
    super(id, context, "NrcUpdate");
    NrcUpdateIn = NrcUpdateInIn;
  }

  public void translateToMap() {
    if (NrcUpdateIn != null) {
      NrcUpdateIn.resetFlags(true, true);
      addInput("Nrc", NrcObjectBaseHelper.toMap(NrcUpdateIn, new HashMap(), "Nrc").get("Nrc"));
    }
  }


/**
 *
 * Sets the Nrc
 * @param NrcUpdateInIn Value of the NrcUpdateIn
 *
 */

  public void setNrc(NrcObjectBaseData NrcUpdateInIn) {
    NrcUpdateIn = NrcUpdateInIn;
  }

  public void translateFromMap() {
    NrcUpdateIn = NrcObjectBaseHelper.fromMap(inputMap, "Nrc");
  }

/**
 *
 * Gets the Nrc
 * @return Value of the Nrc
 *
 */

  public NrcObjectBaseData getNrc( ) {
    return NrcUpdateIn;
  }

}
