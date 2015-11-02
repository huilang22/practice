/*
 * Generated code DO NOT EDIT
 * Generated file: AxrtCountryCodeMapGetBulkUdtTemplateItem.java
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

/**
 *
 * Class used to create a AxrtCountryCodeMapGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AxrtCountryCodeMapGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AxrtCountryCodeMapObjectKeyData AxrtCountryCodeMapIn;
/**
 *
 * Constructor to create a  AxrtCountryCodeMapGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AxrtCountryCodeMapGetBulkUdtTemplateItem(String id, BSDMSessionContext context, AxrtCountryCodeMapObjectKeyData AxrtCountryCodeMapInIn) {
    super(id, context, "AxrtCountryCodeMapGet");
    AxrtCountryCodeMapIn = AxrtCountryCodeMapInIn;
  }

  public void translateToMap() {
    if (AxrtCountryCodeMapIn != null) {
      AxrtCountryCodeMapIn.resetFlags(true, true);
      addInput("AxrtCountryCodeMap", AxrtCountryCodeMapObjectKeyHelper.toMap(AxrtCountryCodeMapIn, new HashMap(), "AxrtCountryCodeMapObjectKeyData").get("AxrtCountryCodeMapObjectKeyData"));
    }
  }


/**
 *
 * Sets the AxrtCountryCodeMap
 * @param AxrtCountryCodeMapInIn Value of the AxrtCountryCodeMapIn
 *
 */

  public void setAxrtCountryCodeMap(AxrtCountryCodeMapObjectKeyData AxrtCountryCodeMapInIn) {
    AxrtCountryCodeMapIn = AxrtCountryCodeMapInIn;
  }

  public void translateFromMap() {
    AxrtCountryCodeMapIn = AxrtCountryCodeMapObjectKeyHelper.fromMap(inputMap, "AxrtCountryCodeMap");
  }

/**
 *
 * Gets the AxrtCountryCodeMap
 * @return Value of the AxrtCountryCodeMap
 *
 */

  public AxrtCountryCodeMapObjectKeyData getAxrtCountryCodeMap( ) {
    return AxrtCountryCodeMapIn;
  }

}
