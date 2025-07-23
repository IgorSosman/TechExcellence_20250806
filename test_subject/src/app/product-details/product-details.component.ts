import {Component, EventEmitter, Input, Output} from '@angular/core';
import { CommonModule } from '@angular/common';
import {IProduct} from "../catalog/product.model";

@Component({
  selector: 'bot-product-details',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './product-details.component.html',
  styleUrls: ['./product-details.component.css']
})
export class ProductDetailsComponent {

 @Input()  product!: IProduct;
 @Output() buy = new EventEmitter();
  getImageUrl(product: IProduct): string {
    return '/assets/images/robot-parts/' + product.imageName;
  }

  getDiscountedClasses(product: IProduct) {
    return {strikethrough:  product.discount > 0};
  }

  buyButtonClicked() {
      this.buy.emit()
  }
}
