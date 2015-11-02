/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DocumentTypeFindBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a DocumentTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class DocumentTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DocumentTypeObjectFilter DocTypefind_In;
/**
 *
 * Constructor to create a  DocumentTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DocumentTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, DocumentTypeObjectFilter DocTypefind_InIn) {
    super(id, context, "DocumentTypeFind");
    DocTypefind_In = DocTypefind_InIn;
  }

  public void translateToMap() {
    if (DocTypefind_In != null) {
      Integer index =  DocTypefind_In.getIndex();
      if (index != null) addInput("Index", index);
      addInput("DocumentType", DocumentTypeObjectHelper.toMap(DocTypefind_In, new HashMap(), "DocumentType").get("DocumentType"));
    }
  }


/**
 *
 * Sets the DocumentType
 * @param DocTypefind_InIn Value of the DocTypefind_In
 *
 */

  public void setDocumentType(DocumentTypeObjectFilter DocTypefind_InIn) {
    DocTypefind_In = DocTypefind_InIn;
  }

  public void translateFromMap() {
    DocTypefind_In = DocumentTypeObjectHelper.fromMapFilter(inputMap, "DocumentType");
  }

/**
 *
 * Gets the DocumentType
 * @return Value of the DocumentType
 *
 */

  public DocumentTypeObjectFilter getDocumentType( ) {
    return DocTypefind_In;
  }

}
