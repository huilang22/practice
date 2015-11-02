/*
 * Generated code DO NOT EDIT
 * Generated file: NrcTransDescrGetBulkUdtTemplateItem.java
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
 * Class used to create a NrcTransDescrGetBulkUdtTemplateItem Bulk Template
 *
 */

public class NrcTransDescrGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NrcTransDescrObjectKeyData nrcGetIn;
/**
 *
 * Constructor to create a  NrcTransDescrGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NrcTransDescrGetBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcTransDescrObjectKeyData nrcGetInIn) {
    super(id, context, "NrcTransDescrGet");
    nrcGetIn = nrcGetInIn;
  }

  public void translateToMap() {
    if (nrcGetIn != null) {
      nrcGetIn.resetFlags(true, true);
      addInput("NrcTransDescr", NrcTransDescrObjectKeyHelper.toMap(nrcGetIn, new HashMap(), "NrcTransDescrObjectKeyData").get("NrcTransDescrObjectKeyData"));
    }
  }


/**
 *
 * Sets the NrcTransDescr
 * @param nrcGetInIn Value of the nrcGetIn
 *
 */

  public void setNrcTransDescr(NrcTransDescrObjectKeyData nrcGetInIn) {
    nrcGetIn = nrcGetInIn;
  }

  public void translateFromMap() {
    nrcGetIn = NrcTransDescrObjectKeyHelper.fromMap(inputMap, "NrcTransDescr");
  }

/**
 *
 * Gets the NrcTransDescr
 * @return Value of the NrcTransDescr
 *
 */

  public NrcTransDescrObjectKeyData getNrcTransDescr( ) {
    return nrcGetIn;
  }

}
