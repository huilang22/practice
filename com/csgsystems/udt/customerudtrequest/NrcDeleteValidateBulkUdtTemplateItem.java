/*
 * Generated code DO NOT EDIT
 * Generated file: NrcDeleteValidateBulkUdtTemplateItem.java
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
 * Class used to create a NrcDeleteValidateBulkUdtTemplateItem Bulk Template
 *
 */

public class NrcDeleteValidateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NrcObjectBaseData NrcDeleteValidateIn;
/**
 *
 * Constructor to create a  NrcDeleteValidateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NrcDeleteValidateBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcObjectBaseData NrcDeleteValidateInIn) {
    super(id, context, "NrcDeleteValidate");
    NrcDeleteValidateIn = NrcDeleteValidateInIn;
  }

  public void translateToMap() {
    if (NrcDeleteValidateIn != null) {
      NrcDeleteValidateIn.resetFlags(true, true);
      addInput("Nrc", NrcObjectBaseHelper.toMap(NrcDeleteValidateIn, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the Nrc
 * @param NrcDeleteValidateInIn Value of the NrcDeleteValidateIn
 *
 */

  public void setNrc(NrcObjectBaseData NrcDeleteValidateInIn) {
    NrcDeleteValidateIn = NrcDeleteValidateInIn;
  }

  public void translateFromMap() {
    NrcDeleteValidateIn = NrcObjectBaseHelper.fromMap(inputMap, "Nrc");
  }

/**
 *
 * Gets the Nrc
 * @return Value of the Nrc
 *
 */

  public NrcObjectBaseData getNrc( ) {
    return NrcDeleteValidateIn;
  }

}
