/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MIHSubscriberGetBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a MIHSubscriberGetBulkUdtTemplateItem Bulk Template
 *
 */

public class MIHSubscriberGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected String _msisdn;
/**
 *
 * Constructor to create a  MIHSubscriberGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public MIHSubscriberGetBulkUdtTemplateItem(String id, BSDMSessionContext context, String _msisdnIn) {
    super(id, context, "MIHSubscriberGet");
    _msisdn = _msisdnIn;
  }

  public void translateToMap() {
    if (_msisdn != null) {
      addInput("Msisdn", _msisdn);
    }
  }


/**
 *
 * Sets the Msisdn
 * @param _msisdnIn Value of the _msisdn
 *
 */

  public void setMsisdn(String _msisdnIn) {
    _msisdn = _msisdnIn;
  }

  public void translateFromMap() {
    _msisdn = (String)inputMap.get("Msisdn");
  }

/**
 *
 * Gets the Msisdn
 * @return Value of the Msisdn
 *
 */

  public String getMsisdn( ) {
    return _msisdn;
  }

}
