/*
 * Generated code DO NOT EDIT
 * Generated file: NrcUpdateValidateBulkUdtTemplateItem.java
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
 * Class used to create a NrcUpdateValidateBulkUdtTemplateItem Bulk Template
 *
 */

public class NrcUpdateValidateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NrcObjectBaseData NrcUpdateValidateIn;
/**
 *
 * Constructor to create a  NrcUpdateValidateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NrcUpdateValidateBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcObjectBaseData NrcUpdateValidateInIn) {
    super(id, context, "NrcUpdateValidate");
    NrcUpdateValidateIn = NrcUpdateValidateInIn;
  }

  public void translateToMap() {
    if (NrcUpdateValidateIn != null) {
      NrcUpdateValidateIn.resetFlags(true, true);
      addInput("Nrc", NrcObjectBaseHelper.toMap(NrcUpdateValidateIn, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the Nrc
 * @param NrcUpdateValidateInIn Value of the NrcUpdateValidateIn
 *
 */

  public void setNrc(NrcObjectBaseData NrcUpdateValidateInIn) {
    NrcUpdateValidateIn = NrcUpdateValidateInIn;
  }

  public void translateFromMap() {
    NrcUpdateValidateIn = NrcObjectBaseHelper.fromMap(inputMap, "Nrc");
  }

/**
 *
 * Gets the Nrc
 * @return Value of the Nrc
 *
 */

  public NrcObjectBaseData getNrc( ) {
    return NrcUpdateValidateIn;
  }

}
