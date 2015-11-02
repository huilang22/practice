/*
 * Generated code DO NOT EDIT
 * Generated file: NrcTransDescrFindBulkUdtTemplateItem.java
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
 * Class used to create a NrcTransDescrFindBulkUdtTemplateItem Bulk Template
 *
 */

public class NrcTransDescrFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NrcTransDescrObjectFilter nrcFindIn;
/**
 *
 * Constructor to create a  NrcTransDescrFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NrcTransDescrFindBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcTransDescrObjectFilter nrcFindInIn) {
    super(id, context, "NrcTransDescrFind");
    nrcFindIn = nrcFindInIn;
  }

  public void translateToMap() {
    if (nrcFindIn != null) {
      Integer index =  nrcFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("NrcTransDescr", NrcTransDescrObjectHelper.toMap(nrcFindIn, new HashMap(), "NrcTransDescr").get("NrcTransDescr"));
    }
  }


/**
 *
 * Sets the NrcTransDescr
 * @param nrcFindInIn Value of the nrcFindIn
 *
 */

  public void setNrcTransDescr(NrcTransDescrObjectFilter nrcFindInIn) {
    nrcFindIn = nrcFindInIn;
  }

  public void translateFromMap() {
    nrcFindIn = NrcTransDescrObjectHelper.fromMapFilter(inputMap, "NrcTransDescr");
  }

/**
 *
 * Gets the NrcTransDescr
 * @return Value of the NrcTransDescr
 *
 */

  public NrcTransDescrObjectFilter getNrcTransDescr( ) {
    return nrcFindIn;
  }

}
