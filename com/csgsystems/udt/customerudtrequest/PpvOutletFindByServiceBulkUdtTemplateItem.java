/*
 * Generated code DO NOT EDIT
 * Generated file: PpvOutletFindByServiceBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;
import com.csgsystems.ctc.data.*;
import com.csgsystems.om.data.*;
import com.csgsystems.ppv.data.*;

/**
 *
 * Class used to create a PpvOutletFindByServiceBulkUdtTemplateItem Bulk Template
 *
 */

public class PpvOutletFindByServiceBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PpvAccountObjectData _AccountIn;
/**
 *
 * Constructor to create a  PpvOutletFindByServiceBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PpvOutletFindByServiceBulkUdtTemplateItem(String id, BSDMSessionContext context, PpvAccountObjectData _AccountInIn) {
    super(id, context, "PpvOutletFindByService");
    _AccountIn = _AccountInIn;
  }

  public void translateToMap() {
    if (_AccountIn != null) {
      _AccountIn.resetFlags(true, true);
      addInput("AccountIn", PpvAccountObjectHelper.toMap(_AccountIn, new HashMap(), "AccountOut").get("AccountOut"));
    }
  }


/**
 *
 * Sets the AccountIn
 * @param _AccountInIn Value of the _AccountIn
 *
 */

  public void setAccountIn(PpvAccountObjectData _AccountInIn) {
    _AccountIn = _AccountInIn;
  }

  public void translateFromMap() {
    _AccountIn = PpvAccountObjectHelper.fromMap(inputMap, "AccountIn");
  }

/**
 *
 * Gets the AccountIn
 * @return Value of the AccountIn
 *
 */

  public PpvAccountObjectData getAccountIn( ) {
    return _AccountIn;
  }

}
